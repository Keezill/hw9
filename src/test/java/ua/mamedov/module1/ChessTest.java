package ua.mamedov.module1;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ChessTest {

    @InjectMocks
    Chess chess;

    @Mock
    Converter converter;

    @Test
    public void converter_nominal() {
        Mockito.when(converter.converter("A", 2)).thenReturn(1);
        int result = chess.readUserInputKnight("A", 2);
        assertEquals(1, result);
    }

    @Test
    public void converter_out_of_bounds(){
        Mockito.when(converter.converter("q", 16)).thenReturn(-1);
        int result = chess.readUserInputKnight("q", 16);
        assertEquals(-1, result);
    }

    @Test
    public void checkForRowsAndCols_nominal(){
        boolean result = chess.checkForRowsAndCols(2,12);
        assertTrue(result);
    }

    @Test
    public void checkForRowsAndCols_wrong_position(){
        boolean result = chess.checkForRowsAndCols(2,8);
        assertFalse(result);
    }

    @Test
    public void readUserInputMove_nominal(){
        Mockito.when(chess.readUserInputMove("B", 3, 1)).thenReturn(1);
        int result = converter.converter("B",3);
        assertEquals(1, result);
    }

    @Test
    public void readUserInputMove_wrong_cell(){
        Mockito.when(chess.readUserInputMove("B", 3, 5)).thenReturn(-1);
        int result = chess.readUserInputMove("B", 3, 5);
        assertEquals(-1, result);
    }
}
