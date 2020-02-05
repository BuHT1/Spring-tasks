package com.epam.springtasks.firsttask;

import org.springframework.beans.factory.annotation.Autowired;

public class Second {
    @Autowired
    Third thirdBean;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Second{");
        sb.append("thirdBean=").append(thirdBean);
        sb.append('}');
        return sb.toString();
    }
}
