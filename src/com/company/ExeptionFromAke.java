package com.company;

import java.io.IOException;

public class ExeptionFromAke extends IOException {
    public ExeptionFromAke() {
    }

    public ExeptionFromAke(String message) {
        super(message);
    }
}
