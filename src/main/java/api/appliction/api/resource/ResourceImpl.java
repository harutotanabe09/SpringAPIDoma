package api.appliction.api.resource;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import api.appliction.entity.dto.Dto;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResourceImpl implements Resource {

    List<? extends Dto> data;

    // メッセージ
    String message;
}