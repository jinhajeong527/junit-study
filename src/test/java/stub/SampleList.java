package stub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

public class SampleList {
    @Test
    public void test() {
        List mock = mock(List.class);
        when(mock.size()).thenReturn(10).thenReturn(20);
        assertEquals(10, mock.size());
        assertEquals(20, mock.size());
    }

    @Test
    public void testWithParameters() {
        List mock = mock(List.class);
        when(mock.get(0)).thenReturn("hello");
        assertEquals("hello", mock.get(0));
    }
}
