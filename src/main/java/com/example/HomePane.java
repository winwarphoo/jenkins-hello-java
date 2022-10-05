package com.example;

/* Home画面クラス */
public class HomePane extends Pane {
	
	public HomePane(JustPayApp app) {
		super(app);
	}

	@Override
	public void doAction(String command) {
		switch(command) {
			case "READ_BUTTON":
				//バーコード読取画面に遷移
				app.setPane(BarCodeReaderPane.class);
				break;
		}
		
	}
}
