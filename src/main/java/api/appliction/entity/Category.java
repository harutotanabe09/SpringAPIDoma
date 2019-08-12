package api.appliction.entity;

import api.appliction.entity.dto.DomaDtoImpl;
import lombok.Getter;
import lombok.Setter;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

@Table(name = "categories")
@Entity
@Getter
@Setter
public class Category extends DomaDtoImpl {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  // 名前
  String name;

  // アカウント
  String account;

  // メール
  String mail;
}
