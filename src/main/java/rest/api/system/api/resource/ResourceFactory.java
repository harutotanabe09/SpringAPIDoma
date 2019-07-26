package rest.api.system.api.resource;

/** リソースファクトリ */
public interface ResourceFactory {

  /**
   * インスタンスを作成します。
   *
   * @return
   */
  Resource create();
}
