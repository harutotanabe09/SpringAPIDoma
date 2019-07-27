package api.appliction.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import api.appliction.entity.Category;

@ConfigAutowireable
@Dao
public interface CategoryDao {

  /**
   * データ取得
   *
   * @param CodeCategory
   * @return
   */
  @Select
  Category selectById(int id);
}
