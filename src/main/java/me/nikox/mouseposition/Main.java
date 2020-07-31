package me.nikox.mouseposition;

import lc.kra.system.mouse.GlobalMouseHook;
import me.nikox.mouseposition.listeners.MousePosListener;
import me.nikox.mouseposition.window.Window;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(Window::new);
        GlobalMouseHook hook = new GlobalMouseHook();
        hook.addMouseListener(new MousePosListener());
    }
}
