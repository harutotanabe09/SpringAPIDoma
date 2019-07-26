package rest.api.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rest.api.system.dao.CategoryDao;
import rest.api.system.entity.Category;

@Service
public class CategoryService {

  @Autowired CategoryDao categoryDao;

  public Category findById(int id) {
    return categoryDao.selectById(id);
  }
}
