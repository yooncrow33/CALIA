package com.calia.internal.editer;

import java.util.Properties;

public class CaliaConfig {
    public String name;
    public String width, height;
    public String worldWidth, worldHeight;
    public int physics;
    public String fps;
    public boolean console, antiAliasing;

    public CaliaConfig(String name) {
        this.name = name;
    }

    // Properties 객체로 변환 (저장용)
    public Properties toProperties() {
        Properties props = new Properties();
        props.setProperty("resolution_width", width);
        props.setProperty("resolution_height", height);
        props.setProperty("world_width", worldWidth);
        props.setProperty("world_height", worldHeight);
        props.setProperty("physics_multiplier", String.valueOf(physics));
        props.setProperty("target_fps", fps);
        props.setProperty("console_enabled", String.valueOf(console));
        props.setProperty("anti_aliasing", String.valueOf(antiAliasing));
        return props;
    }

    // Properties 객체에서 데이터 로드 (로드용)
    public void fromProperties(Properties props) {
        this.width = props.getProperty("resolution_width", "1920");
        this.height = props.getProperty("resolution_height", "1080");
        this.worldWidth = props.getProperty("world_width", "1920");
        this.worldHeight = props.getProperty("world_height", "1080");
        this.physics = Integer.parseInt(props.getProperty("physics_multiplier", "50"));
        this.fps = props.getProperty("target_fps", "60 FPS");
        this.console = Boolean.parseBoolean(props.getProperty("console_enabled", "false"));
        this.antiAliasing = Boolean.parseBoolean(props.getProperty("anti_aliasing", "false"));
    }
}