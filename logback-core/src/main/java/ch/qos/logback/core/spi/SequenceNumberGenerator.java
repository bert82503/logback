package ch.qos.logback.core.spi;

/**
 * Generate sequence numbers
 * 序列号生成器，生成序列号
 * 
 * @since 1.3.0
 * @author Ceki G&uuml;lc&uuml;
 */
public interface SequenceNumberGenerator extends ContextAware {

    long nextSequenceNumber();

}
