package com.duytb.demo2;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Human {
    @Qualifier("dress")
    @Autowired
    public Outfit outfit;

    public Human() {

    }

    public Human(Outfit outfit) {
        this.outfit = outfit;
    }


}
