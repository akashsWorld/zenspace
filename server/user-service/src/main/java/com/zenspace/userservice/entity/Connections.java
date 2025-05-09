package com.zenspace.userservice.entity;



import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Entity
@Table(name = "user_connection_with")
public class Connections {

    @EmbeddedId
    private ConnectionsId users;

    @CreationTimestamp
    private LocalDate localDate;
}

