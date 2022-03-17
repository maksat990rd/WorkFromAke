package com.company;

import java.io.IOException;

public class ExeptionFromString extends IOException {
    public ExeptionFromString() {
    }

    public ExeptionFromString(String message) {
        super(message);
    }
}
