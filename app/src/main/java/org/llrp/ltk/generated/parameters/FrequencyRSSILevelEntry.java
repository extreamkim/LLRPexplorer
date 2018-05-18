/*
 *
 * This file was generated by LLRP Code Generator
 * see http://llrp-toolkit.cvs.sourceforge.net/llrp-toolkit/
 * for more information
 * Generated on: Sun Apr 08 14:14:11 EDT 2012;
 *
 */

/*
 * Copyright 2007 ETH Zurich
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 *
 */
package org.llrp.ltk.generated.parameters;

import maximsblog.blogspot.com.llrpexplorer.Logger;

import org.jdom2.Content;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Namespace;

import org.llrp.ltk.exceptions.InvalidLLRPMessageException;
import org.llrp.ltk.exceptions.MissingParameterException;
import org.llrp.ltk.generated.LLRPConstants;
import org.llrp.ltk.generated.interfaces.Timestamp;
import org.llrp.ltk.generated.parameters.UTCTimestamp;
import org.llrp.ltk.generated.parameters.Uptime;
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPMessage;
import org.llrp.ltk.types.SignedByte;
import org.llrp.ltk.types.SignedShort;
import org.llrp.ltk.types.TLVParameter;
import org.llrp.ltk.types.TVParameter;
import org.llrp.ltk.types.UnsignedInteger;
import org.llrp.ltk.types.UnsignedShort;

import java.util.LinkedList;
import java.util.List;


/**
 * DescriptionFrequency:  The frequency on which the measurement was taken, specified in kHz.Bandwidth:  The measurement bandwidth of the measurement in kHz.Average RSSI: The average power level observed at this frequency in dBm.Peak RSSI: The peak power level observed at this frequency in dBm.


See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=85&view=fit">LLRP Specification Section 13.2.4.1</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=147&view=fit">LLRP Specification Section 16.2.7.4.1</a>}


 */

/**
 * DescriptionFrequency:  The frequency on which the measurement was taken, specified in kHz.Bandwidth:  The measurement bandwidth of the measurement in kHz.Average RSSI: The average power level observed at this frequency in dBm.Peak RSSI: The peak power level observed at this frequency in dBm.


See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=85&view=fit">LLRP Specification Section 13.2.4.1</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=147&view=fit">LLRP Specification Section 16.2.7.4.1</a>}

      .
 */
public class FrequencyRSSILevelEntry extends TLVParameter {
    public static final SignedShort TYPENUM = new SignedShort(243);
    private static final Logger LOGGER = Logger.getLogger(FrequencyRSSILevelEntry.class);
    protected UnsignedInteger frequency;
    protected UnsignedInteger bandwidth;
    protected SignedByte averageRSSI;
    protected SignedByte peakRSSI;
    protected Timestamp timestamp;

    /**
     * empty constructor to create new parameter.
     */
    public FrequencyRSSILevelEntry() {
    }

    /**
     * Constructor to create parameter from binary encoded parameter
     * calls decodeBinary to decode parameter.
     * @param list to be decoded
     */
    public FrequencyRSSILevelEntry(LLRPBitList list) {
        decodeBinary(list);
    }

    /**
    * Constructor to create parameter from xml encoded parameter
    * calls decodeXML to decode parameter.
    * @param element to be decoded
    */
    public FrequencyRSSILevelEntry(Element element)
        throws InvalidLLRPMessageException {
        decodeXML(element);
    }

    /**
    * {@inheritDoc}
    */
    public LLRPBitList encodeBinarySpecific() {
        LLRPBitList resultBits = new LLRPBitList();

        if (frequency == null) {
            LOGGER.warn(" frequency not set");
            throw new MissingParameterException(
                " frequency not set  for Parameter of Type FrequencyRSSILevelEntry");
        }

        resultBits.append(frequency.encodeBinary());

        if (bandwidth == null) {
            LOGGER.warn(" bandwidth not set");
            throw new MissingParameterException(
                " bandwidth not set  for Parameter of Type FrequencyRSSILevelEntry");
        }

        resultBits.append(bandwidth.encodeBinary());

        if (averageRSSI == null) {
            LOGGER.warn(" averageRSSI not set");
            throw new MissingParameterException(
                " averageRSSI not set  for Parameter of Type FrequencyRSSILevelEntry");
        }

        resultBits.append(averageRSSI.encodeBinary());

        if (peakRSSI == null) {
            LOGGER.warn(" peakRSSI not set");
            throw new MissingParameterException(
                " peakRSSI not set  for Parameter of Type FrequencyRSSILevelEntry");
        }

        resultBits.append(peakRSSI.encodeBinary());

        if (timestamp == null) {
            // single parameter, may not be null
            LOGGER.warn(" timestamp not set");
            throw new MissingParameterException(" timestamp not set");
        } else {
            resultBits.append(timestamp.encodeBinary());
        }

        return resultBits;
    }

    /**
    * {@inheritDoc}
    */
    public Content encodeXML(String name, Namespace ns) {
        // element in namespace defined by parent element
        Element element = new Element(name, ns);
        // child element are always in default LLRP namespace
        ns = Namespace.getNamespace("llrp", LLRPConstants.LLRPNAMESPACE);

        if (frequency == null) {
            LOGGER.warn(" frequency not set");
            throw new MissingParameterException(" frequency not set");
        } else {
            element.addContent(frequency.encodeXML("Frequency", ns));
        }

        if (bandwidth == null) {
            LOGGER.warn(" bandwidth not set");
            throw new MissingParameterException(" bandwidth not set");
        } else {
            element.addContent(bandwidth.encodeXML("Bandwidth", ns));
        }

        if (averageRSSI == null) {
            LOGGER.warn(" averageRSSI not set");
            throw new MissingParameterException(" averageRSSI not set");
        } else {
            element.addContent(averageRSSI.encodeXML("AverageRSSI", ns));
        }

        if (peakRSSI == null) {
            LOGGER.warn(" peakRSSI not set");
            throw new MissingParameterException(" peakRSSI not set");
        } else {
            element.addContent(peakRSSI.encodeXML("PeakRSSI", ns));
        }

        //parameters
        if (timestamp == null) {
            LOGGER.info("timestamp not set");
            throw new MissingParameterException("timestamp not set");
        } else {
            element.addContent(timestamp.encodeXML(timestamp.getClass()
                                                            .getSimpleName(), ns));
        }

        return element;
    }

    /**
    * {@inheritDoc}
    */
    protected void decodeBinarySpecific(LLRPBitList binary) {
        int position = 0;
        int tempByteLength;
        int tempLength = 0;
        int count;
        SignedShort type;
        int fieldCount;
        Custom custom;
        frequency = new UnsignedInteger(binary.subList(position,
                    UnsignedInteger.length()));
        position += UnsignedInteger.length();
        bandwidth = new UnsignedInteger(binary.subList(position,
                    UnsignedInteger.length()));
        position += UnsignedInteger.length();
        averageRSSI = new SignedByte(binary.subList(position,
                    SignedByte.length()));
        position += SignedByte.length();
        peakRSSI = new SignedByte(binary.subList(position, SignedByte.length()));
        position += SignedByte.length();

        // look ahead to see type
        // may be optional or exactly once
        type = null;
        tempByteLength = 0;
        tempLength = 0;

        try {
            // if first bit is one it is a TV Parameter
            if (binary.get(position)) {
                // do not take the first bit as it is always 1
                type = new SignedShort(binary.subList(position + 1, 7));
            } else {
                type = new SignedShort(binary.subList(position +
                            RESERVEDLENGTH, TYPENUMBERLENGTH));
                tempByteLength = new UnsignedShort(binary.subList(position +
                            RESERVEDLENGTH + TYPENUMBERLENGTH,
                            UnsignedShort.length())).toShort();
                tempLength = 8 * tempByteLength;
            }
        } catch (IllegalArgumentException le) {
            // if an IllegalArgumentException is thrown, list was not long enough so the parameter is missing
            LOGGER.warn(
                "FrequencyRSSILevelEntry misses non optional parameter of type Timestamp");
            throw new MissingParameterException(
                "FrequencyRSSILevelEntry misses non optional parameter of type Timestamp");
        }

        boolean found = false;
        LOGGER.debug("decoding choice type Timestamp ");

        //if first bit is 1 it is a TV Parameter
        if (binary.get(position)) {
            // length can statically be determined for TV Parameters
            tempLength = UTCTimestamp.length();
        }

        if ((type != null) && type.equals(UTCTimestamp.TYPENUM)) {
            timestamp = new UTCTimestamp(binary.subList(position, tempLength));
            LOGGER.debug(" timestamp instatiated to UTCTimestamp with length " +
                tempLength);
            position += tempLength;
            found = true;
        }

        //if first bit is 1 it is a TV Parameter
        if (binary.get(position)) {
            // length can statically be determined for TV Parameters
            tempLength = Uptime.length();
        }

        if ((type != null) && type.equals(Uptime.TYPENUM)) {
            timestamp = new Uptime(binary.subList(position, tempLength));
            LOGGER.debug(" timestamp instatiated to Uptime with length " +
                tempLength);
            position += tempLength;
            found = true;
        }

        if (!found) {
            LOGGER.warn(
                "encoded message misses non optional parameter timestamp");
            throw new MissingParameterException(
                "FrequencyRSSILevelEntry misses non optional parameter of type Timestamp");
        }
    }

    /**
    * {@inheritDoc}
    */
    public void decodeXML(Element element) throws InvalidLLRPMessageException {
        List<Element> tempList = null;
        boolean atLeastOnce = false;
        Custom custom;

        Element temp = null;

        // child element are always in default LLRP namespace
        Namespace ns = Namespace.getNamespace(LLRPConstants.LLRPNAMESPACE);

        temp = element.getChild("Frequency", ns);

        if (temp != null) {
            frequency = new UnsignedInteger(temp);
        }

        element.removeChild("Frequency", ns);
        temp = element.getChild("Bandwidth", ns);

        if (temp != null) {
            bandwidth = new UnsignedInteger(temp);
        }

        element.removeChild("Bandwidth", ns);
        temp = element.getChild("AverageRSSI", ns);

        if (temp != null) {
            averageRSSI = new SignedByte(temp);
        }

        element.removeChild("AverageRSSI", ns);
        temp = element.getChild("PeakRSSI", ns);

        if (temp != null) {
            peakRSSI = new SignedByte(temp);
        }

        element.removeChild("PeakRSSI", ns);

        //choices - must check all possible subtypes
        boolean found = false;
        LOGGER.debug("decoding choice type Timestamp ");
        // try to get child for each possible subtype
        temp = element.getChild("UTCTimestamp", ns);

        if (temp != null) {
            timestamp = new UTCTimestamp(temp);
            LOGGER.debug(" timestamp instatiated to UTCTimestamp with");
            found = true;
        }

        element.removeChild("UTCTimestamp", ns);
        // try to get child for each possible subtype
        temp = element.getChild("Uptime", ns);

        if (temp != null) {
            timestamp = new Uptime(temp);
            LOGGER.debug(" timestamp instatiated to Uptime with");
            found = true;
        }

        element.removeChild("Uptime", ns);

        if (!found) {
            LOGGER.info(
                "FrequencyRSSILevelEntry misses optional parameter of type timestampList");
        }

        if (element.getChildren().size() > 0) {
            String message = "FrequencyRSSILevelEntry has unknown element " +
                ((Element) element.getChildren().get(0)).getName();
            throw new InvalidLLRPMessageException(message);
        }
    }

    //setters
    /**
    * set   frequency of type UnsignedInteger .
    * @param   frequency to be set
    */
    public void setFrequency(final UnsignedInteger frequency) {
        this.frequency = frequency;
    }

    /**
    * set   bandwidth of type UnsignedInteger .
    * @param   bandwidth to be set
    */
    public void setBandwidth(final UnsignedInteger bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
    * set   averageRSSI of type SignedByte .
    * @param   averageRSSI to be set
    */
    public void setAverageRSSI(final SignedByte averageRSSI) {
        this.averageRSSI = averageRSSI;
    }

    /**
    * set   peakRSSI of type SignedByte .
    * @param   peakRSSI to be set
    */
    public void setPeakRSSI(final SignedByte peakRSSI) {
        this.peakRSSI = peakRSSI;
    }

    /**
    * set timestamp of type Timestamp.
    * @param  timestamp to be set
    */
    public void setTimestamp(final Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    // end setter

    //getters
    /**
    * get   frequency of type UnsignedInteger.
    * @return   type UnsignedInteger to be set
    */
    public UnsignedInteger getFrequency() {
        return this.frequency;
    }

    /**
    * get   bandwidth of type UnsignedInteger.
    * @return   type UnsignedInteger to be set
    */
    public UnsignedInteger getBandwidth() {
        return this.bandwidth;
    }

    /**
    * get   averageRSSI of type SignedByte.
    * @return   type SignedByte to be set
    */
    public SignedByte getAverageRSSI() {
        return this.averageRSSI;
    }

    /**
    * get   peakRSSI of type SignedByte.
    * @return   type SignedByte to be set
    */
    public SignedByte getPeakRSSI() {
        return this.peakRSSI;
    }

    /**
    * get timestamp of type Timestamp .
    * @return  Timestamp
    */
    public Timestamp getTimestamp() {
        return timestamp;
    }

    // end getters

    //add methods

    // end add

    /**
    * For TLV Parameter length can not be determined at compile time. This method therefore always returns 0.
    * @return Integer always zero
    */
    public static Integer length() {
        return 0;
    }

    /**
    * {@inheritDoc}
    */
    public SignedShort getTypeNum() {
        return TYPENUM;
    }

    /**
    * {@inheritDoc}
    */
    public String getName() {
        return "FrequencyRSSILevelEntry";
    }

    /**
    * return string representation. All field values but no parameters are included
    * @return String
    */
    public String toString() {
        String result = "FrequencyRSSILevelEntry: ";
        result += ", frequency: ";
        result += frequency;
        result += ", bandwidth: ";
        result += bandwidth;
        result += ", averageRSSI: ";
        result += averageRSSI;
        result += ", peakRSSI: ";
        result += peakRSSI;
        result = result.replaceFirst(", ", "");

        return result;
    }
}
