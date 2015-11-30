package org.ferris.mouser.main;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class MouseMoveTask extends TimerTask {

    @Override
    public void run() {
        try {
            System.out.printf(
                "Moving the mouse! (%s) \n"
                , new SimpleDateFormat("HH:mm:ss").format(new Date())
            );

            PointerInfo pi = MouseInfo.getPointerInfo();
            Point p = pi.getLocation();

            Robot robot = new Robot();
            robot.mouseMove(p.x + 2, p.y + 2);
            robot.mouseMove(p.x, p.y);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
