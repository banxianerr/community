package life.majiang.community.community.dto;

import lombok.Data;

@Data
public class GithubUser {
    private String login;//name
    private Long id;
    private String node_id;//bio
    private String avatarUrl;

}
