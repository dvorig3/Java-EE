package com.mycompany.app;

import java.util.Map;
import javax.validation.constraints.NotNull;
import static com.mycompany.app.StaticInfo.*; 
import org.springframework.beans.factory.annotation.Autowired;

public class FruitSlicerCombain extends FruitSlicer {

	@Autowired
	@NotNull
	private Map<String, IFruit> sliceConveyor;

	@SuppressWarnings("unchecked")
	public FruitSlicerCombain() {
		super();
		System.out.println("  ... calling FruitSlicerCombain()");
		setSliceConveyor((Map<String, IFruit>) SERVICE_CONTEXT
				.getBean("initCWP"));
	}

	@SuppressWarnings("unchecked")
	public FruitSlicerCombain(@NotNull IFruit k) {
		super(k);
		System.out.println("  ... calling FruitSlicerCombain(IFruit k)");
		setSliceConveyor((Map<String, IFruit>) SERVICE_CONTEXT
				.getBean("initCWP"));
	}

	public FruitSlicerCombain(@NotNull Map<String, IFruit> conv) {
		super();
		System.out.println("  ... calling FruitSlicerCombain(Map<String, IFruit> conv)");
		setSliceConveyor(conv);
	}

	public void multySlice() {
		System.out.println("  ... calling multySlice()");
		System.out.println(">> Preparing fruit salad : ");
		for (String s : sliceConveyor.keySet()) {
			System.out.println(">>> Slicing " + sliceConveyor.get(s).getName());
		}
		System.out.println(">> Ready!!!");
	}

	public Map<String, IFruit> getSliceConveyor() {
		System.out.println("  ... calling getSliceConveyor()");
		return sliceConveyor;
	}

	public void setSliceConveyor(@NotNull Map<String, IFruit> sliceConveyor) {
		System.out.println("  ... calling setSliceConveyor()");
		this.sliceConveyor = sliceConveyor;
	}
}
