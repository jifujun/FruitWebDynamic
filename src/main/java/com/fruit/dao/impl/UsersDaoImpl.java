package com.fruit.dao.impl;

import com.fruit.dao.UsersDao;
import com.fruit.model.Users;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 快乐的小菌菌 on 2017/6/27.
 */
@Repository
public class UsersDaoImpl implements UsersDao {
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    @Resource
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public void userRegister(Users users) {
        hibernateTemplate.save(users);
    }

    @Override
    public void userUpdate() {

    }

    @Override
    public List<Users> userIsExist(String phone, String password) {
        return getHibernateTemplate().execute(new HibernateCallback<List<Users>>() {
            @Override
            public List<Users> doInHibernate(Session session) throws HibernateException {
                Query query = session.createQuery("select phone,password from Users where phone=? and password=?");
                query.setParameter(0, phone);
                query.setParameter(1, password);
                return query.list();
            }
        });
    }
}
