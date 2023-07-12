package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoItemTest {
    private static final TodoItem TODO_ITEM = new TodoItem("title", "detail", "status");

    @Test
    void getTitle_ShouldBeTit(){
        Assertions.assertEquals("title",TODO_ITEM.getTitle());
    }

    @Test
    void getDetail_ShouldBeDetail(){
        Assertions.assertEquals("detail",TODO_ITEM.getDetail());
    }
    @Test
    void getStatus_ShouldBeStatus(){
        Assertions.assertEquals("status",TODO_ITEM.getStatus());
    }

    @Test
    void setStatus(){
        String expectedStatus = "newStatus";
        TODO_ITEM.setStatus(expectedStatus);
        Assertions.assertEquals(expectedStatus, TODO_ITEM.getStatus());
    }

    @Test
    void setTitle(){
        String expectedTitle = "newTitle";
        TODO_ITEM.setTitle(expectedTitle);
        Assertions.assertEquals(expectedTitle, TODO_ITEM.getTitle());
    }

    @Test
    void setDetails(){
        String expectedDetail = "newDetails";
        TODO_ITEM.setDetail(expectedDetail);
        Assertions.assertEquals(expectedDetail, TODO_ITEM.getDetail());
    }
}
