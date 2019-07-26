package rest.api.system.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import rest.api.system.entity.Category;

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
