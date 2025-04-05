package com.cromxt.zenspaceserver.dtos.response;


import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SpacePageableResponse {
    private Integer pageNumber;
    private Integer pageSize;
    private Integer totalElements;
    private Integer totalPages;
    private Boolean last;
    public List<SpaceResponse> spaceResponses;
}
