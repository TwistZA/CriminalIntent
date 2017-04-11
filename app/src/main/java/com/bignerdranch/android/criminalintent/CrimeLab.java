package com.bignerdranch.android.criminalintent;

import android.content.Context;
import android.support.constraint.solver.ArrayLinkedVariables;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Avinash.Ganga on 09/03/17.
 */

class CrimeLab {
    private static CrimeLab sCrimeLab ;
    private ArrayList<Crime> mCrimes;

    public static CrimeLab get(Context context) {
        if (sCrimeLab==null){
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
    }

    public List<Crime> getCrimes(){
        return this.mCrimes;
    }

    public Crime getCrime(UUID id){
       for (Crime crime:mCrimes){
           if (crime.getId().equals(id)){
               return crime;
           }
       }
       return null;
    }

    public void addCrime(Crime c) {
        mCrimes.add(c);
    }

    public void deleteCrime(Crime c){
        int index = mCrimes.indexOf(c);
        mCrimes.remove(index);
    }
}
