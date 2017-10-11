package DemoTeste;

import Collection.Storable;
import GameClasses.*;
import Resources.Adapter;
import Resources.Enums.PlayerMovementDirection;
import Resources.Exceptions.DuplicateLevelsId;
import Resources.Exceptions.FileHandlingException;
import Resources.Exceptions.KeyNotFoundException;
import Resources.Exceptions.ObjectException;
import java.io.File;
import java.io.IOException;

/**
 * Nome: José Eduardo Grandão da Silva Ribeiro 
 * Número: 8140166 
 * Turma: 1
 */
public class Demo {

    public static void main(String[] args) throws DuplicateLevelsId, ObjectException, IOException, KeyNotFoundException, FileHandlingException {

        //Nível 1
        
        //Objeto Arvore
//        GameAnimation treeAnimation = new GameAnimation("assets\\Tree\\", 10000, 10, 10);
//        GameAnimation treeAnimation2 = new GameAnimation("assets\\Tree\\", 1000000000, 10, 10);
//        GameCollisionRectangle treeBox2 = new GameCollisionRectangle(200, 200, -5, 65, 0.1f, 654, 1);
//        GameCollisionRectangle treeBox3 = new GameCollisionRectangle(200, 200, -5, 65, 0.1f, 654, 350);
//        GameCollisionRectangle treeBox4 = new GameCollisionRectangle(200, 200, -5, 65, 0.1f, 250, 18);
//        GameCollisionRectangle treeBox5 = new GameCollisionRectangle(200, 200, -5, 65, 0.1f, 120, 18);
//        GameCollisionRectangle treeBox6 = new GameCollisionRectangle(200, 200, -5, 65, 0.1f, 500, 1);
//        GameCollisionRectangle treeBox7 = new GameCollisionRectangle(200, 200, -5, 65, 0.1f, 180, 350);
//        GameCollisionRectangle treeBox8 = new GameCollisionRectangle(200, 200, -5, 65, 0.1f, 500, 350);
//        GameObject tree2 = new GameObject("Tree 2", 654, 1, 200, 200, true, treeAnimation, treeBox2);
//        GameObject tree3 = new GameObject("Tree 3", 654, 350, 200, 200, true, treeAnimation, treeBox3);
//        GameObject tree4 = new GameObject("Tree 4", 250, 18, 200, 200, true, treeAnimation2, treeBox4);
//        GameObject tree5 = new GameObject("Tree 5", 120, 18, 200, 200, true, treeAnimation2, treeBox5);
//        GameObject tree6 = new GameObject("Tree 6", 500, 1, 200, 200, true, treeAnimation2, treeBox6);
//        GameObject tree7 = new GameObject("Tree 7", 180, 350, 200, 200, true, treeAnimation2, treeBox7);
//        GameObject tree8 = new GameObject("Tree 8", 500, 350, 200, 200, true, treeAnimation2, treeBox8);
//
//        //Objeto Casa
//        GameAnimation houseAnimation = new GameAnimation("assets\\House\\", 0, 10, 10);
//        GameCollisionRectangle houseBox = new GameCollisionRectangle(150, 150, 0, 0, 1f, 50, 380);
//        GameCollisionRectangle houseBox2 = new GameCollisionRectangle(150, 150, 0, 0, 1f, 400, 380);
//        GameCollisionRectangle houseBox3 = new GameCollisionRectangle(150, 150, 0, 0, 1f, 50, 50);
//        GameCollisionRectangle houseBox4 = new GameCollisionRectangle(150, 150, 0, 0, 1f, 400, 50);
//        GameCollisionRectangle houseBox5 = new GameCollisionRectangle(150, 150, 0, 0, 1f, 400, 225);
//        GameObject house = new GameObject("House 1", 50, 380, 150, 150, true, houseAnimation, houseBox);
//        GameObject house2 = new GameObject("House 2", 400, 380, 150, 150, true, houseAnimation, houseBox2);
//        GameObject house3 = new GameObject("House 3", 50, 50, 150, 150, true, houseAnimation, houseBox3);
//        GameObject house4 = new GameObject("House 4", 400, 50, 150, 150, true, houseAnimation, houseBox4);
//        GameObject house5 = new GameObject("House 5", 400, 225, 150, 150, false, houseAnimation, houseBox5);
//        
//        //Player
//        GameCollisionRectangle playerBox = new GameCollisionRectangle(60, 60, 0, 0, 0, 350, 400);
//        GamePlayer player = new GamePlayer(true, "Zombie", 129, 281, 60, 60, true, playerBox);
//        
//        //Adicionar Animação ao Player
//        player.addAnimation(PlayerMovementDirection.UP, new GameAnimation("assets\\PlayerAnimation\\up\\", 20, 50, 50));
//        player.addAnimation(PlayerMovementDirection.DOWN, new GameAnimation("assets\\PlayerAnimation\\down\\", 20, 50, 50));
//        player.addAnimation(PlayerMovementDirection.LEFT, new GameAnimation("assets\\PlayerAnimation\\left\\", 20, 50, 50));
//        player.addAnimation(PlayerMovementDirection.RIGHT, new GameAnimation("assets\\PlayerAnimation\\right\\", 20, 50, 50));
//        player.addAnimation(PlayerMovementDirection.IDLE, new GameAnimation("assets\\PlayerAnimation\\idle\\", 20, 50, 50));
//       
//        //Cenário
//        GameScenario cenario = new GameScenario(1, "Scene1", 800, 800, "assets\\background.png", "assets\\music.ogg");
//        
//        //Adicionar Objetos ao Cenário
//        cenario.addGameObject(tree2);
//        cenario.addGameObject(tree3);
//        cenario.addGameObject(tree4);
//        cenario.addGameObject(tree5);
//        cenario.addGameObject(tree6);
//        cenario.addGameObject(tree7);
//        cenario.addGameObject(tree8);
//        cenario.addGameObject(house);
//        cenario.addGameObject(house2);
//        cenario.addGameObject(house3);
//        cenario.addGameObject(house4);
//        cenario.addGameObject(house5);
//
//        //Criar Nível
//        GameLevel nivel = new GameLevel(cenario, player, false, 1, "Level 1");
//
//        //Nivel 2
//        
//        //Objetos
//        GameAnimation castleAnimation = new GameAnimation("assets\\Level2\\Castle\\", 0, 10, 10);
//        GameCollisionRectangle castleBox = new GameCollisionRectangle(350, 350, 0, 0, 1, 250, 100);
//        GameObject castle = new GameObject("Castle", 250, 100, 350, 350, true, castleAnimation, castleBox);
//        
//        GameCollisionRectangle treeBox9 = new GameCollisionRectangle(200, 200, -5, 65, 0.1f, 2, 200);
//        GameCollisionRectangle treeBox10 = new GameCollisionRectangle(200, 200, -5, 65, 0.1f, 100, 320);
//        GameCollisionRectangle treeBox11 = new GameCollisionRectangle(200, 200, -5, 65, 0.1f, 645, 165);
//        GameObject tree9 = new GameObject("Tree 9", 2, 320, 200, 200, true, treeAnimation2, treeBox9);
//        GameObject tree10 = new GameObject("Tree 10", 100, 320, 200, 200, true, treeAnimation2, treeBox10);
//        GameObject tree11 = new GameObject("Tree 11", 645, 165, 200, 200, true, treeAnimation2, treeBox11);
//
//        //Cenário
//        GameScenario cenario2 = new GameScenario(2, "Scene2", 800, 800, "assets\\background.png", "assets\\music.ogg");
//        
//        //Adicionar Objetos ao Cenário
//        cenario2.addGameObject(castle);
//        cenario2.addGameObject(house3);
//        cenario2.addGameObject(tree5);
//        cenario2.addGameObject(tree6);
//        cenario2.addGameObject(tree2);
//        cenario2.addGameObject(tree9);
//        cenario2.addGameObject(tree10);
//        cenario2.addGameObject(tree3);
//        cenario2.addGameObject(tree8);
//        cenario2.addGameObject(tree11);
//
//        //Adicionar Nivel
//        GameLevel nivel2 = new GameLevel(cenario2, player, false, 2, "Level 2");
//        
//        //Container
//        GameContainer container = GameContainer.getInstance();
//        
//        //Fazer Set do Container
//        container.setGameContainer(false, "PPStudios Game");
//        
//        //Adicionar Niveis ao Container
//        container.addNewLevel(nivel);
//        container.addNewLevel(nivel2);


//        Start Game
//        Adapter.StartGame(container);

        Storable store = new Storable("saves\\save.txt");
        //Guardar no Ficheiro
//        store.saveToFile(container, store.getPath());
        
        //Load do Ficheiro
        Object obj = store.loadFromFile(store.getPath());
        //Inicialização do jogo
        if (obj instanceof GameContainer) {
            GameContainer container = (GameContainer) obj;
            Adapter.StartGame(container);
        }
    }
}
