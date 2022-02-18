package org.sid.demospringcloudstreamskafka.entities;

/*--Permet de gérer les évènements qui se produisent dans les pages visités par les users--*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class PageEvent {
    private String name;
    private String user;
    private Date date;
    private long duration;
}
