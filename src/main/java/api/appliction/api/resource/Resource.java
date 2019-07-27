package api.appliction.api.resource;

import java.util.List;

import api.appliction.entity.dto.Dto;

public interface Resource {

  List<? extends Dto> getData();

  void setData(List<? extends Dto> data);

  String getMessage();

  void setMessage(String message);
}
