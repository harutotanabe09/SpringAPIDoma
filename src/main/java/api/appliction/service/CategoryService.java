package api.appliction.service;

import api.appliction.dao.CategoryDao;
import api.appliction.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

  @Autowired CategoryDao categoryDao;

  public Category findById(int id) {
    return categoryDao.selectById(id);
  }
}
