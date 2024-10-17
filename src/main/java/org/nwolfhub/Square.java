package org.nwolfhub;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Square extends GeometricObject {
    private double side=0d;


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
