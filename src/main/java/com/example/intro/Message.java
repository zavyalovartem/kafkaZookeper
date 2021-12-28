package com.example.intro;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Message {
    int example;
    Date timestamp;
}
