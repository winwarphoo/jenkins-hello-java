package com.example;

/** バーコード読み取り画面 */
public class BarCodeReaderPane extends Pane {
	public BarCodeReaderPane(JustPayApp app) {
		super(app);
	}

	@Override
	public void doAction(String command) {
		switch(command) {
			case "READ_BARCODE":
				//バーコード読取画面に遷移
				app.setPane(ConfirmPane.class);
				break;
			case "CANCEL_BUTTON":
				// キャンセルボタン
				app.setPane(HomePane.class);
				break;
		}
		
	}
}
