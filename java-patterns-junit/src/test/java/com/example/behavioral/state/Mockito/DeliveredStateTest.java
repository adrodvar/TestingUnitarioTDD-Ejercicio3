package com.example.behavioral.state.Mockito;

import com.example.behavioral.state.DeliveredState;
import com.example.behavioral.state.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class DeliveredStateTest {
    @Mock
    Order order = new Order();
    @InjectMocks
    DeliveredState delivered = new DeliveredState();

    @Test
    void DeliveredStateTest() {
        Order order1 = new Order( 1L, LocalDateTime.now());
        when(order.getId()).thenReturn(order1.getId());

        delivered.next(order1);
        delivered.previous(order1);

        assertNotNull(order.getId());
        verify(order).getId();
    }
}