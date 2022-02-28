package org.vashonsd;

import java.io.InputStream;
import java.io.PrintStream;

public interface Executable {
    public void start(InputStream is, PrintStream ps);

    public void stop();

    public boolean isRunning();

    public String getName();

    public String getDescription();

    public String getAuthor();
}