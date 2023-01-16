#version 400 core

in vec3 positon;

out vec3 color;

void main(){
    gl_Position = vec4(positon, 1.0);
    color = vec3(positon.x + 0.85, 0.17, positon.y + 0.25);
}