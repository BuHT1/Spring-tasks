package com.epam.springtasks.firsttask;

import org.springframework.beans.factory.annotation.Autowired;

public class Third {
    @Autowired
    First firstBean;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Third{");
        sb.append("firstBean=").append(firstBean);
        sb.append('}');
        return sb.toString();
    }
}
