package com.example.cmpshop.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * This class provides the first creation and last update dates for extended entities\
 * contains fields createAt and updateAt formatted according to local date
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseEntity {
    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;
    @PrePersist
    public void prePersist() {
        TimeZone vietnamTimeZone = TimeZone.getTimeZone("Asia/Ho_Chi_Minh");
        Calendar calendar = Calendar.getInstance(vietnamTimeZone);
        Date currentTime = calendar.getTime();
        this.createAt = currentTime; // Set `createAt` when the entity is first created
        this.updateAt = currentTime; // Also initialize `updateAt` to the same time
    }

    @PreUpdate
    public void preUpdate() {
        TimeZone vietnamTimeZone = TimeZone.getTimeZone("Asia/Ho_Chi_Minh");
        Calendar calendar = Calendar.getInstance(vietnamTimeZone);
        this.updateAt = calendar.getTime(); // Update `updateAt` only when the entity is modified
    }
}