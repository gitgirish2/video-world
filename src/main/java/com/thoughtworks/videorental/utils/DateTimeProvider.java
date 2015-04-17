package com.thoughtworks.videorental.utils;

import org.joda.time.LocalDateTime;
import org.springframework.stereotype.Component;

@Component
public class DateTimeProvider {

    public LocalDateTime getLocalDateTime(){
        return new LocalDateTime();
    }
}
