package com.Gregory.HelloWorldLombok.model;

import lombok.*;

/**
 * @author Thiago Araújo
 * @since 15/04/2020 - 23:00
 * @version 1.0
 */

@ToString
@Getter @Setter
@NoArgsConstructor
public class Consoles {

    private String name;
    private String manufacturer;
    private String sizeHD;
    private int releaseYear;

}
