package com.game.grostesk.systems;

import com.jme3.app.Application;
import com.jme3.app.SimpleApplication;
import com.jme3.app.state.BaseAppState;
import com.jme3.math.Vector3f;
import com.jme3.renderer.Camera;

public class CameraSystem extends BaseAppState {

    private SimpleApplication app;

    private Camera cam;

    private final Vector3f OFFSET = new Vector3f(0, 15, 15);

    private final Vector3f TARGET = new Vector3f(0, 0, 0);

    @Override
    protected void initialize(Application app) {
        this.app = (SimpleApplication) app;

        this.cam = app.getCamera();

        cam.setLocation(OFFSET);

        cam.lookAt(TARGET, Vector3f.UNIT_Y);

        this.app.getFlyByCamera().setEnabled(false);

        this.app.getInputManager().setCursorVisible(true);


    }

    @Override
    protected void cleanup(Application app) {

    }

    @Override
    protected void onEnable() {

    }

    @Override
    protected void onDisable() {

    }
}
