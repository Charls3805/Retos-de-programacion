# -*- coding: utf-8 -*-
"""
Created on Tue Nov 12 19:35:29 2024

@author: Carlos
"""

import pygame
import sys

#Definir la clase Auto
class Auto:
    def __init__(self, nombre, vel_max, color, y_position):
        self.nombre = nombre
        self.vel_max = vel_max
        self.color = color
        self.x_position = 0
        self.y_position = y_position
        
    def avanzar(self):
        self.x_position += self.vel_max
        
def main():
    pygame.init()
    screen = pygame.display.set_mode((800, 600))
    pygame.display.set_caption('Carrera de autos')
    font = pygame.font.Font(None, 24)
    
    clock = pygame.time.Clock()
    
    autos = [
        Auto("Rayo McQueen", 2, (255,0,0),100),
        Auto("Franchesco", 3, (128,255,255),200),
        Auto("Bujias", 2.5, (187,51,255), 300)
        ]
    running = True
    while running:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                running = False
        screen.fill((255, 255, 255))
        
        for auto in autos:
            auto.avanzar()
            pygame.draw.rect(screen, auto.color, pygame.Rect(auto.x_position, auto.y_position, 60,30))
            label = font.render(f"{auto.nombre} - {auto.vel_max*60} km/h", True, (0, 0, 0))
            screen.blit(label, (auto.x_position, auto.y_position - 20))
            
        pygame.display.flip() #actualiza la pantalla
        
        for auto in autos:
            if auto.x_position > 800:
                print(f"{auto.nombre} ha ganado la carrera")
                running = False
                break
        clock.tick(60) #FPS
        
    pygame.quit()
    sys.exit()
    
if __name__== '__main__':
    main()

