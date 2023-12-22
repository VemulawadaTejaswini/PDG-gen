import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.close();
		List<Long> dp = new ArrayList<>();
		for (int i6 = 0; i6 < 2; i6++) {
			long i6v = i6 * (long) Math.pow(10, 18);
			for (int i5 = 0; i5 < 10; i5++) {
				if (i6v != 0 && Math.abs(i5 - i6) > 1) {
					continue;
				}
				long i5v = i5 * (long) Math.pow(10, 17);
				for (int i4 = 0; i4 < 10; i4++) {
					if ((i6v + i5v) != 0 && Math.abs(i4 - i5) > 1) {
						continue;
					}
					long i4v = i4 * (long) Math.pow(10, 16);
					for (int i3 = 0; i3 < 10; i3++) {
						if ((i6v + i5v + i4v) != 0 && Math.abs(i3 - i4) > 1) {
							continue;
						}
						long i3v = i3 * (long) Math.pow(10, 15);
						for (int i2 = 0; i2 < 10; i2++) {
							if ((i6v + i5v + i4v + i3v) != 0 && Math.abs(i2 - i3) > 1) {
								continue;
							}
							long i2v = i2 * (long) Math.pow(10, 14);
							for (int i1 = 0; i1 < 10; i1++) {
								if ((i6v + i5v + i4v + i3v + i2v) != 0 && Math.abs(i1 - i2) > 1) {
									continue;
								}
								long i1v = i1 * (long) Math.pow(10, 13);
								for (int i7 = 0; i7 < 10; i7++) {
									if ((i6v + i5v + i4v + i3v + i2v + i1v) != 0 && Math.abs(i7 - i1) > 1) {
										continue;
									}
									long i7v = i7 * (long) Math.pow(10, 12);
									for (int i8 = 0; i8 < 10; i8++) {
										if ((i7v + i6v + i5v + i4v + i3v + i2v + i1v) != 0 && Math.abs(i8 - i7) > 1) {
											continue;
										}
										long i8v = i8 * (long) Math.pow(10, 11);
										for (int i9 = 0; i9 < 10; i9++) {
											if ((i8v + i7v + i6v + i5v + i4v + i3v + i2v + i1v) != 0
													&& Math.abs(i9 - i8) > 1) {
												continue;
											}
											long i9v = i9 * (long) Math.pow(10, 10);
											for (int i10 = 0; i10 < 10; i10++) {
												if ((i9v + i8v + i7v + i6v + i5v + i4v + i3v + i2v + i1v) != 0
														&& Math.abs(i10 - i9) > 1) {
													continue;
												}
												long i10v = i10 * (long) Math.pow(10, 9);
												for (int i11 = 0; i11 < 10; i11++) {
													if ((i10v + i9v + i8v + i7v + i6v + i5v + i4v + i3v + i2v + i1v) != 0
															&& Math.abs(i11 - i10) > 1) {
														continue;
													}
													long i11v = i11 * (long) Math.pow(10, 8);
													for (int i12 = 0; i12 < 10; i12++) {
														if ((i11v + i10v + i9v + i8v + i7v + i6v + i5v + i4v + i3v + i2v + i1v) != 0
																&& Math.abs(i12 - i11) > 1) {
															continue;
														}
														long i12v = i12 * (long) Math.pow(10, 7);
														for (int i13 = 0; i13 < 10; i13++) {
															if ((i12v + i11v + i10v + i9v + i8v + i7v + i6v + i5v + i4v + i3v + i2v + i1v) != 0
																	&& Math.abs(i13 - i12) > 1) {
																continue;
															}
															long i13v = i13 * (long) Math.pow(10, 6);
															for (int i14 = 0; i14 < 10; i14++) {
																if ((i13v + i12v + i11v + i10v + i9v + i8v + i7v + i6v + i5v + i4v + i3v + i2v + i1v) != 0
																		&& Math.abs(i13 - i14) > 1) {
																	continue;
																}
																long i14v = i14 * (long) Math.pow(10, 5);
																for (int i15 = 0; i15 < 10; i15++) {
																	if ((i14v + i13v + i12v + i11v + i10v + i9v + i8v + i7v + i6v + i5v + i4v + i3v + i2v + i1v) != 0
																			&& Math.abs(i15 - i14) > 1) {
																		continue;
																	}
																	long i15v = i15 * (long) Math.pow(10, 4);
																	for (int i16 = 0; i16 < 10; i16++) {
																		if ((i15v + i14v + i13v + i12v + i11v + i10v + i9v + i8v + i7v + i6v + i5v + i4v + i3v + i2v + i1v) != 0
																				&& Math.abs(i15 - i16) > 1) {
																			continue;
																		}
																		long i16v = i16 * (long) Math.pow(10, 3);
																		for (int i17 = 0; i17 < 10; i17++) {
																			if ((i16v + i15v + i14v + i13v + i12v + i11v + i10v + i9v + i8v + i7v + i6v + i5v + i4v + i3v + i2v + i1v) != 0
																					&& Math.abs(i17 - i16) > 1) {
																				continue;
																			}
																			long i17v = i17 * (long) Math.pow(10, 2);
																			for (int i18 = 0; i18 < 10; i18++) {
																				if ((i17v + i16v + i15v + i14v + i13v + i12v + i11v + i10v + i9v + i8v + i7v + i6v + i5v + i4v + i3v + i2v + i1v) != 0
																						&& Math.abs(i18 - i17) > 1) {
																					continue;
																				}
																				dp.add(i17v + i16v + i15v + i14v + i13v + i12v + i11v + i10v + i9v + i8v + i7v + i6v + i5v + i4v + i3v + i2v + i1v);
																				if(dp.size()>=k+1) {
																					System.out.println(dp.get(k));
																					return;
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
	}
}
