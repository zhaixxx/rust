package com.rust.Item;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Appeal {
    Integer apNum;
    String apContext;
    Integer piId;
    String apType;
    String apTel;
    Date apTime;
    Integer apResult;
    Integer aoStatus;

}
