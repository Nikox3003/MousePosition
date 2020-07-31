package me.nikox.mouseposition.listeners;

import lc.kra.system.mouse.event.GlobalMouseEvent;
import lc.kra.system.mouse.event.GlobalMouseListener;
import me.nikox.mouseposition.window.Window;

public class MousePosListener implements GlobalMouseListener {

    @Override
    public void mousePressed(GlobalMouseEvent globalMouseEvent) {
        //ignore
    }

    @Override
    public void mouseReleased(GlobalMouseEvent globalMouseEvent) {
        //ignore
    }

    @Override
    public void mouseMoved(GlobalMouseEvent globalMouseEvent) {
        Window.x.setText("X: " + globalMouseEvent.getX());
        Window.y.setText("Y: " + globalMouseEvent.getY());
    }

    @Override
    public void mouseWheel(GlobalMouseEvent globalMouseEvent) {
        //ignore
    }
}
