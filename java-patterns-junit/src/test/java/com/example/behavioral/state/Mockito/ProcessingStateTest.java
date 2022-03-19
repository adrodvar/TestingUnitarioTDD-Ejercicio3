package com.example.behavioral.state.Mockito;

import com.example.behavioral.state.DeliveredState;
import com.example.behavioral.state.Order;
import com.example.behavioral.state.ProcessingState;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProcessingStateTest {

    @Mock
    Order order = new Order();
    @InjectMocks
    ProcessingState state = new ProcessingState();

    @Test
    void ProcessingStateTest() {
        Order order1 = new Order( 1L, LocalDateTime.now());
        when(order.getId()).thenReturn(order1.getId());

        state.next(order1);
        state.previous(order1);

        assertNotNull(order.getId());
        verify(order).getId();
    }
}