package org.firstinspires.ftc.teamcode.auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import org.firstinspires.ftc.teamcode.hdwr.QWERTY;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@Autonomous(name = "GTGoal", group = "Autonomous")
public class GTGoal extends OpMode {
    private QWERTY bm;

    @Override
    public void init() {
        this.bm = new QWERTY(hardwareMap);
        bm.pushCoord(0,100);
        //bm.pushCoord(85,0);
        //bm.pushCoord(85,170);
        //bm.pushCoord(-85,170);
        //bm.pushCoord(-85,0);
        //bm.pushCoord(0,0);
    }

    @Override
    public void loop() {
        bm.iterateGTG();
        telemetry.addData("Postion: ", bm.debugStrPos());
        telemetry.addData("Heading: ", bm.debugStrHead());
    }
}
