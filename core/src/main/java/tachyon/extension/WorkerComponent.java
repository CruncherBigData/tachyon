package tachyon.extension;

import java.nio.ByteBuffer;
import java.util.List;

/**
 * Extended component running in Tachyon Worker.
 */
public abstract class WorkerComponent extends ComponentUtils {
  public abstract List<ByteBuffer> process(List<ByteBuffer> data) throws ComponentException;
}
