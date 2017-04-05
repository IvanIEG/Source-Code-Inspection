package br.calebe.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoedaInvalidaException extends Exception {
      public PapelMoedaInvalidaException(String message) {
        super(message);
    }

    public PapelMoedaInvalidaException() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
