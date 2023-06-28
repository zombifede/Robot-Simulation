package it.unicam.cs.followme.utilities;

import java.util.Optional;
import java.util.stream.Stream;
/*
MIT License

Copyright (c) 2023 Michele Loreti

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */
public enum RobotCommand {




    MOVE("MOVE"),
    SIGNAL("SIGNAL"),
    UNSIGNAL("UNSIGNAL"),
    FOLLOW("FOLLOW"),
    STOP("STOP"),
    SKIP("SKIP"),
    REPEAT("REPEAT"),
    UNTIL("UNTIL"),
    FOREVER("DO FOREVER"),
    DONE("DONE")
    ;

    private final String code;

    RobotCommand(String code) {
        this.code = code;
    }

    boolean isCommandOfLine(String line) {
        return line.startsWith(this.code);
    }

    static Optional<RobotCommand> selectCommand(String line) {
        return Stream.of(RobotCommand.values()).filter(c -> c.isCommandOfLine(line)).findFirst();
    }

}
