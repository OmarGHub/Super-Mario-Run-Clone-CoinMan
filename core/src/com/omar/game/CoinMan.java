package com.omar.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class CoinMan extends ApplicationAdapter {
	SpriteBatch batch;
	Texture background;
	Texture[] man;
	int manStat = 0;
	int pause = 0;

	@Override
	public void create () {
		batch = new SpriteBatch();
		background = new Texture("bg.png");
		man = new Texture[4];
		man[0] = new Texture("frame-1.png");
		man[1] = new Texture("frame-2.png");
		man[2] = new Texture("frame-3.png");
		man[3] = new Texture("frame-3.png");

	}

	@Override
	public void render () {
		batch.begin();
		batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

		if (pause < 8){
			pause++;
		}else{
			pause = 0;
			if (manStat < 3) {
				manStat++;
			}else {
				manStat = 0;
			}

		}



		batch.draw(man[manStat], Gdx.graphics.getWidth()/2 - man[manStat].getWidth()/2, Gdx.graphics.getHeight()/2);


		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
