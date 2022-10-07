package com.example.smartphone;

import java.util.Arrays;

import com.example.smartphone.options.CompensationService;
import com.example.smartphone.options.NetSecurity;
import com.example.smartphone.options.RemoteSupport;

/**
 * BillCalculator
*/
public class BillCalculator {
	
	public static int getBillPerMonth(Option... options) {
		if (isOptionPack(options)) {
			return 1000;
		} else {
			return Arrays.asList(options).stream()
				.map(opt -> opt.getBillPerMonth())
				.reduce(0, (x, y) -> x + y);
		}
		// int bill = 0;
    // if (option.length == 3) {
    //   bill = 1000;
    // } else {
    //   for (Option op : option) {
    //     bill += op.getBillPerMonth();
    //   }
    // }
    // return bill;
		}

	private static boolean isOptionPack(Option[] options) {
		return Arrays.asList(options).stream()
			.anyMatch(opt -> opt instanceof CompensationService)
			&&
			Arrays.asList(options).stream()
			.anyMatch(opt -> opt instanceof RemoteSupport)
			&&
			Arrays.asList(options).stream()
			.anyMatch(opt -> opt instanceof NetSecurity);
  }
}
