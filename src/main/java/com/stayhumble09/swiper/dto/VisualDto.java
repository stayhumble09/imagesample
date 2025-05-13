package com.stayhumble09.swiper.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class VisualDto {
    private int id;

    private String mainMessage;
    private String subMessage;

    private String visual;
    private String renameVisual;
}
