/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.code.impl;

import java.util.Collection;

import kdm.code.AbstractCodeRelationship;
import kdm.code.CodePackage;
import kdm.code.CommentUnit;
import kdm.code.DerivedType;
import kdm.code.ItemUnit;

import kdm.core.AggregatedRelationship;
import kdm.core.KDMEntity;
import kdm.core.KDMRelationship;

import kdm.core.impl.ElementImpl;

import kdm.kdm.ExtendedValue;
import kdm.kdm.KDMModel;
import kdm.kdm.Stereotype;

import kdm.source.SourceRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kdm.code.impl.DerivedTypeImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link kdm.code.impl.DerivedTypeImpl#getTaggedValue <em>Tagged Value</em>}</li>
 *   <li>{@link kdm.code.impl.DerivedTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link kdm.code.impl.DerivedTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link kdm.code.impl.DerivedTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link kdm.code.impl.DerivedTypeImpl#getCodeRelation <em>Code Relation</em>}</li>
 *   <li>{@link kdm.code.impl.DerivedTypeImpl#getItemUnit <em>Item Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DerivedTypeImpl extends ElementImpl implements DerivedType {
	/**
	 * The cached value of the '{@link #getStereotype() <em>Stereotype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected EList<Stereotype> stereotype;

	/**
	 * The cached value of the '{@link #getTaggedValue() <em>Tagged Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaggedValue()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtendedValue> taggedValue;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceRef> source;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected EList<CommentUnit> comment;

	/**
	 * The cached value of the '{@link #getCodeRelation() <em>Code Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractCodeRelationship> codeRelation;

	/**
	 * The cached value of the '{@link #getItemUnit() <em>Item Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemUnit()
	 * @generated
	 * @ordered
	 */
	protected ItemUnit itemUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodePackage.Literals.DERIVED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getStereotype() {
		if (stereotype == null) {
			stereotype = new EObjectResolvingEList<Stereotype>(Stereotype.class, this, CodePackage.DERIVED_TYPE__STEREOTYPE);
		}
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtendedValue> getTaggedValue() {
		if (taggedValue == null) {
			taggedValue = new EObjectContainmentEList<ExtendedValue>(ExtendedValue.class, this, CodePackage.DERIVED_TYPE__TAGGED_VALUE);
		}
		return taggedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.DERIVED_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceRef> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<SourceRef>(SourceRef.class, this, CodePackage.DERIVED_TYPE__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommentUnit> getComment() {
		if (comment == null) {
			comment = new EObjectContainmentEList<CommentUnit>(CommentUnit.class, this, CodePackage.DERIVED_TYPE__COMMENT);
		}
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractCodeRelationship> getCodeRelation() {
		if (codeRelation == null) {
			codeRelation = new EObjectContainmentEList<AbstractCodeRelationship>(AbstractCodeRelationship.class, this, CodePackage.DERIVED_TYPE__CODE_RELATION);
		}
		return codeRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemUnit getItemUnit() {
		return itemUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemUnit(ItemUnit newItemUnit, NotificationChain msgs) {
		ItemUnit oldItemUnit = itemUnit;
		itemUnit = newItemUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodePackage.DERIVED_TYPE__ITEM_UNIT, oldItemUnit, newItemUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemUnit(ItemUnit newItemUnit) {
		if (newItemUnit != itemUnit) {
			NotificationChain msgs = null;
			if (itemUnit != null)
				msgs = ((InternalEObject)itemUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodePackage.DERIVED_TYPE__ITEM_UNIT, null, msgs);
			if (newItemUnit != null)
				msgs = ((InternalEObject)newItemUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodePackage.DERIVED_TYPE__ITEM_UNIT, null, msgs);
			msgs = basicSetItemUnit(newItemUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.DERIVED_TYPE__ITEM_UNIT, newItemUnit, newItemUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createAggregation(KDMEntity otherEntity) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteAggregation(AggregatedRelationship aggregation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMRelationship> getInbound() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMRelationship> getOutbound() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMRelationship> getOwnedRelation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AggregatedRelationship> getInAggregated() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AggregatedRelationship> getOutAggregated() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KDMEntity getOwner() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMEntity> getOwnedElement() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMEntity> getGroup() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMEntity> getGroupedElement() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KDMModel getModel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodePackage.DERIVED_TYPE__TAGGED_VALUE:
				return ((InternalEList<?>)getTaggedValue()).basicRemove(otherEnd, msgs);
			case CodePackage.DERIVED_TYPE__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case CodePackage.DERIVED_TYPE__COMMENT:
				return ((InternalEList<?>)getComment()).basicRemove(otherEnd, msgs);
			case CodePackage.DERIVED_TYPE__CODE_RELATION:
				return ((InternalEList<?>)getCodeRelation()).basicRemove(otherEnd, msgs);
			case CodePackage.DERIVED_TYPE__ITEM_UNIT:
				return basicSetItemUnit(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.DERIVED_TYPE__STEREOTYPE:
				return getStereotype();
			case CodePackage.DERIVED_TYPE__TAGGED_VALUE:
				return getTaggedValue();
			case CodePackage.DERIVED_TYPE__NAME:
				return getName();
			case CodePackage.DERIVED_TYPE__SOURCE:
				return getSource();
			case CodePackage.DERIVED_TYPE__COMMENT:
				return getComment();
			case CodePackage.DERIVED_TYPE__CODE_RELATION:
				return getCodeRelation();
			case CodePackage.DERIVED_TYPE__ITEM_UNIT:
				return getItemUnit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodePackage.DERIVED_TYPE__STEREOTYPE:
				getStereotype().clear();
				getStereotype().addAll((Collection<? extends Stereotype>)newValue);
				return;
			case CodePackage.DERIVED_TYPE__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends ExtendedValue>)newValue);
				return;
			case CodePackage.DERIVED_TYPE__NAME:
				setName((String)newValue);
				return;
			case CodePackage.DERIVED_TYPE__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends SourceRef>)newValue);
				return;
			case CodePackage.DERIVED_TYPE__COMMENT:
				getComment().clear();
				getComment().addAll((Collection<? extends CommentUnit>)newValue);
				return;
			case CodePackage.DERIVED_TYPE__CODE_RELATION:
				getCodeRelation().clear();
				getCodeRelation().addAll((Collection<? extends AbstractCodeRelationship>)newValue);
				return;
			case CodePackage.DERIVED_TYPE__ITEM_UNIT:
				setItemUnit((ItemUnit)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CodePackage.DERIVED_TYPE__STEREOTYPE:
				getStereotype().clear();
				return;
			case CodePackage.DERIVED_TYPE__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case CodePackage.DERIVED_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CodePackage.DERIVED_TYPE__SOURCE:
				getSource().clear();
				return;
			case CodePackage.DERIVED_TYPE__COMMENT:
				getComment().clear();
				return;
			case CodePackage.DERIVED_TYPE__CODE_RELATION:
				getCodeRelation().clear();
				return;
			case CodePackage.DERIVED_TYPE__ITEM_UNIT:
				setItemUnit((ItemUnit)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CodePackage.DERIVED_TYPE__STEREOTYPE:
				return stereotype != null && !stereotype.isEmpty();
			case CodePackage.DERIVED_TYPE__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case CodePackage.DERIVED_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CodePackage.DERIVED_TYPE__SOURCE:
				return source != null && !source.isEmpty();
			case CodePackage.DERIVED_TYPE__COMMENT:
				return comment != null && !comment.isEmpty();
			case CodePackage.DERIVED_TYPE__CODE_RELATION:
				return codeRelation != null && !codeRelation.isEmpty();
			case CodePackage.DERIVED_TYPE__ITEM_UNIT:
				return itemUnit != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DerivedTypeImpl