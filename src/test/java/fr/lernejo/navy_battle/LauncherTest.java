package fr.lernejo.navy_battle;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class LauncherTest {
    boolean CheckArg(String args) {
        return (args.length() == 1);
    }

    @ParameterizedTest
    @ValueSource(strings = {"arg1"})
    void test_CheckArg_one_true(String args) {
        assertTrue(CheckArg(args));
    }

    @ParameterizedTest
    @EmptySource
    @NullSource
    @ValueSource(strings = {""})
    void test_CheckArg_empty_false(String args) {
        assertFalse(CheckArg(args));
    }

    @ParameterizedTest
    @ValueSource(strings = {"arg1", "arg2"})
    void test_CheckArg_more_false(String args) {
        assertFalse(CheckArg(args));
    }
}
