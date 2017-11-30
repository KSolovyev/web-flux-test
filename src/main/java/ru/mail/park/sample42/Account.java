package ru.mail.park.sample42;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Account {
    @Id
    private ObjectId id;
    private String ownerName;
    private String ownerSerName;
    private long value;
    private int currencyId;
}
